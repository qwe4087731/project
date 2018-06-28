import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import VueCookies from 'vue-cookies'

Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(VueCookies)

import app from './App.vue'
import router from './router.js'
import global from './global.js'

Vue.http.options.root = global.request_host;
//全局设置post提交的时候表单格式的组织格式
// Vue.http.options.emulateJSON = true;
Vue.http.options.timeout = 6000;
//允许跨域的时候携带cookie
Vue.http.options.credentials = true;

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
        // Vue.http.interceptors.push(function (request) {
        //
        // });
    },
    router: router,
    render: c => c(app),

})
