import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import {Header, Swipe, SwipeItem} from 'mint-ui'
import './lib/mui/css/mui.min.css'
import './lib/mui/css/icons-extra.css'
import app from './App.vue'
import router from './router.js'


Vue.use(VueRouter)
Vue.use(VueResource)

Vue.component(Header.name, Header)
Vue.component(Swipe.name, Swipe);
Vue.component(SwipeItem.name, SwipeItem);

var vm = new Vue({
    el: '#app',
    router: router,
    render: c => c(app)
})
