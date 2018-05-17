import Vue from 'vue'
import VueRouter from 'vue-router'
import router from './router.js'
import {Header} from 'mint-ui'
import app from './App.vue'
import './lib/mui/css/mui.min.css'


Vue.use(VueRouter)
Vue.component(Header.name, Header)

var vm = new Vue({
    el: '#app',
    router: router,
    render: c => c(app)
})