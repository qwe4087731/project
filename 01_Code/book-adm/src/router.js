import VueRouter from 'vue-router'
import LoginContainer from './component/login/LoginContainer.vue'
import HomeContainer from './component/home/HomeContainer.vue'

var router = new VueRouter({
    routes: [
        {
            path: '/',
            redirect: 'home'
        },
        {
            path: '/login',
            component: LoginContainer
        },
        {
            path: '/home',
            component: HomeContainer
        }
    ]
})

export default router