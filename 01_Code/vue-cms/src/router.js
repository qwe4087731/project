import VueRouter from 'vue-router'
import HomeContainer from './component/tabbar/HomeContainer.vue'
import MemberContainer from './component/tabbar/MemberContainer.vue'
import ShopcarContainer from './component/tabbar/ShopcarContainer.vue'
import SearchContainer from './component/tabbar/SearchContainer.vue'
import NewsList from './component/news/NewsList.vue'
import NewsInfo from './component/news/NewsInfo.vue'
import PhotoList from './component/photos/PhotoList.vue'
import PhotoInfo from './component/photos/PhotoInfo.vue'
import GoodsList from './component/goods/GoodsList.vue'
import GoodsInfo from './component/goods/GoodsInfo.vue'
import GoodsDesc from './component/goods/GoodsDesc.vue'
import GoodsComment from './component/goods/GoodsComment.vue'

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
        },
        {
            path: '/home/newslist',
            component: NewsList
        },
        {
            path: '/home/newsinfo/:id',
            component: NewsInfo
        },
        {
            path: '/home/photolist',
            component: PhotoList
        },
        {
            path: '/home/photoinfo/:id',
            component: PhotoInfo
        },
        {
            path: '/home/goodslist',
            component: GoodsList
        },
        {
            name: 'goodsinfo',
            path: '/home/goodsinfo/:id',
            component: GoodsInfo
        },
        {
            name: "goodsdesc",
            path: "/home/goodsdesc/:id",
            component: GoodsDesc
        },
        {
            name: "goodscomment",
            path: "/home/goodscomment/:id",
            component: GoodsComment
        }
    ],
    linkActiveClass: 'mui-active'
})

export default router