import VueRouter from 'vue-router'
import HomeContainer from './component/HomeContainer.vue'
import MemberContainer from './component/MemberContainer.vue'
import ShopcarContainer from './component/ShopcarContainer.vue'
import SearchContainer from './component/SearchContainer.vue'

var router = new VueRouter({
    routes: [
        {
            path: '/',
            redirect: 'home'
        },
        {
            path: '/home',
            component: HomeContainer
        },
        {
            path: '/member',
            component: MemberContainer
        },
        {
            path: '/shopcar',
            component: ShopcarContainer
        },
        {
            path: '/search',
            component: SearchContainer
        }
    ],
    linkActiveClass: 'mui-active'
})

export default router