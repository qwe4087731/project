import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import VueCookies from 'vue-cookies'

//
Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(VueCookies)
//
import app from './App.vue'
import router from './router.js'
import global from './global.js'
// // import router from './router.js'
//
Vue.http.options.root = global.request_host;
// //全局设置post提交的时候表单格式的组织格式
Vue.http.options.emulateJSON = true;
Vue.http.options.timeout = 6000;
Vue.http.options.withCredentials = true;
// // router: router,


// var token = this.$cookies.get("token");

Vue.prototype.request = function (url, method, data, success, fail) {
    if (method && method.toUpperCase() === "POST") {
        this.$http.post(url, data).then(response => {
            console.log("response");
            console.log(response);
            var data = response.body;
            if (data[0] === 1) {
                if (success && typeof success === 'function') {
                    success(data[2]);
                }
            } else if (data[0] === -1) {
                this.$router.push({
                    path: '/login'
                });
            } else {
                if (fail && typeof fail === 'function') {
                    fail(data[1], data[0]);
                }
            }
        }, response => {
            //服务器服务不存在，或者断网
            console.log("response");
            console.log(response);
            if (fail && typeof fail === 'function') {
                fail("请求服务器异常", response.status);
            }
        });
    }
}

var vm = new Vue({
    el: '#app',
    data: {},
    created() {
        global.user_token = this.$cookies.get("token");
        console.log("global token:" + global.user_token);
        Vue.http.interceptors.push(function (request) {
            // if (global.user_token) {
            //     request.headers.set('cookie', "token=" + global.user_token);
            // }

            request.credentials = true;

            // return request.respondWith(body, {
            //     status: 404,
            //     statusText: 'Not found'
            // });


            // var that = this;
            // console.log(that instanceof Vue);
            // return function (response) {
            //     console.log("response:" + JSON.stringify(response));
            //     if (response.status === 200) {
            //         if (response.body && response.body[0] === -1) {
            //             console.log("1232");
            //             that.$router.push("/login");
            //         }
            //     }
            // };
        });
    },
    router: router,
    render: c => c(app),

})
