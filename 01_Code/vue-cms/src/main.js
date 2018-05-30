import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import Vuex from 'vuex'
// import {Header, Swipe, SwipeItem, Button, Lazyload} from 'mint-ui'
import './lib/mui/css/mui.min.css'
import './lib/mui/css/icons-extra.css'

import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'

import app from './App.vue'
import router from './router.js'
import moment from 'moment'
import VuePreview from 'vue-preview'


Vue.use(VueRouter)
Vue.use(VueResource)
Vue.use(Vuex)
//图片懒加载必须使用全局导入，局部导入不行
// Vue.use(Lazyload);
Vue.use(MintUI)

// Vue.use(VuePreview)
Vue.use(VuePreview)


Vue.http.options.root = 'http://localhost:8088/';
//全局设置post提交的时候表单格式的组织格式
Vue.http.options.emulateJSON = true;

// Vue.component(Header.name, Header)
// Vue.component(Swipe.name, Swipe);
// Vue.component(SwipeItem.name, SwipeItem);
// Vue.component(Button.name, Button);
var car = JSON.parse(localStorage.getItem("car") || "[]");
const store = new Vuex.Store({
    state: {
        //购物车，数组中的对象有id，count，price，selected(表示是否选中)属性
        car: car
    },
    mutations: {
        addToCar(state, goodsinfo) {
            var flag = false;
            state.car.some(item => {
                if (item.id == goodsinfo.id) {
                    item.count += parseInt(goodsinfo.count);
                    flag = true;
                    return true;
                }
            })

            if (!flag) {
                state.car.unshift(goodsinfo);
            }
            localStorage.setItem("car", JSON.stringify(state.car));
        },
        updateGoodsInfo(state, goodsinfo) {
            state.car.some(item => {
                if (item.id == goodsinfo.id) {
                    item.count = parseInt(goodsinfo.count);
                    return true;
                }
            })
            localStorage.setItem("car", JSON.stringify(state.car));
        },
        updateGoodsSelected(state, info) {
            state.car.some(item => {
                if (item.id == info.id) {
                    item.selected = info.selected;
                    return true;
                }
            })
            localStorage.setItem("car", JSON.stringify(state.car));
        },
        removeFormCar(state, id) {
            state.car.some((item, index) => {
                if (item.id == id) {
                    state.car.splice(index, 1);
                    return true;
                }
            })
            localStorage.setItem("car", JSON.stringify(state.car));
        }
    },
    getters: {
        getAllCount(state) {
            var c = 0;
            state.car.forEach(item => {
                c += item.count;
            })
            return c;
        },
        getGoodsCount(state) {
            var o = {};
            state.car.forEach(item => {
                o[item.id] = item.count;
            })
            return o;
        },
        getGoodsSelected(state) {
            var o = {};
            state.car.forEach(item => {
                o[item.id] = item.selected;
            })
            return o;
        },
        getGoodsCountAndAmount(state) {
            var o = {
                count: 0,
                amount: 0
            };
            state.car.forEach(item => {
                if (item.selected) {
                    o.count += item.count;
                    o.amount += item.price * item.count;
                }
            })
            return o;
        }
    }
})
var vm = new Vue({
    el: '#app',
    router: router,
    render: c => c(app),
    store
})

//定义全局过滤器
Vue.filter('dateFormat', (dateStr, pattern = "YYYY-MM-DD HH:mm:ss") => {
    return moment(dateStr).format(pattern);
})