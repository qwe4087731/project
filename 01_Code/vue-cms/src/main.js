import Vue from 'vue' 
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'

// import {Header, Swipe, SwipeItem, Button, Lazyload} from 'mint-ui'
import './lib/mui/css/mui.min.css'
import './lib/mui/css/icons-extra.css'

import MintUI from 'mint-ui'
import 'mint-ui/lib/style.css'

import app from './App.vue'
import router from './router.js'
import moment from 'moment'


Vue.use(VueRouter)
Vue.use(VueResource)
//图片懒加载必须使用全局导入，局部导入不行
// Vue.use(Lazyload);
Vue.use(MintUI)
import VuePreview from 'vue-preview'

// Vue.use(VuePreview)
Vue.use(VuePreview)


Vue.http.options.root = 'http://localhost:8088/';
//全局设置post提交的时候表单格式的组织格式
Vue.http.options.emulateJSON = true;

// Vue.component(Header.name, Header)
// Vue.component(Swipe.name, Swipe);
// Vue.component(SwipeItem.name, SwipeItem);
// Vue.component(Button.name, Button);

var vm = new Vue({
    el: '#app',
    router: router,
    render: c => c(app)
})

//定义全局过滤器
Vue.filter('dateFormat', (dateStr, pattern = "YYYY-MM-DD HH:mm:ss") => {
    return moment(dateStr).format(pattern);
})