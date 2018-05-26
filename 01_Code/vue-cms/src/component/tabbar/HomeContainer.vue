<template>
    <div>
        <swiper :lunbo-list="lunboList" :isfull="true"></swiper>
        <ul class="mui-table-view mui-grid-view mui-grid-9">
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/newslist">
                    <span class="mui-icon mui-icon-home"></span>
                    <div class="mui-media-body">新闻资讯</div>
                </router-link>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/photolist">
                    <span class="mui-icon mui-icon-email"><span class="mui-badge">5</span></span>
                    <div class="mui-media-body">图片分享</div>
                </router-link>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/goodslist">
                    <span class="mui-icon mui-icon-chatbubble"></span>
                    <div class="mui-media-body">商品购买</div>
                </router-link>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/newslist">
                    <span class="mui-icon mui-icon-location"></span>
                    <div class="mui-media-body">留言反馈</div>
                </router-link>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/newslist">
                    <span class="mui-icon mui-icon-search"></span>
                    <div class="mui-media-body">视频专区</div>
                </router-link>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3">
                <router-link to="/home/newslist">
                    <span class="mui-icon mui-icon-phone"></span>
                    <div class="mui-media-body">联系我们</div>
                </router-link>
            </li>
        </ul>
    </div>
</template>

<script>
    import {Toast} from 'mint-ui'
    import swiper from '../subcomponent/swiper.vue'

    export default {
        name: "home",
        data: function () {
            return {
                lunboList: []

            };
        },
        created: function () {
            this.getLunbotu();
        },
        components: {
            swiper
        },
        methods: {
            getLunbotu: function () {
                // this.$http.get("/api/getlunbo").then(response => {
                //     console.log("success:");
                //     console.log(response);
                // }, response => {
                //     console.log("error:");
                //     console.log(response);
                // });
                if (true) {
                    this.lunboList = [{
                        'img': 'http://img.zcool.cn/community/018c3d59ac137da801211d25932cbd.jpg@1280w_1l_2o_100sh.png',
                        'url': '1'
                    }, {
                        'img': 'http://img.zcool.cn/community/01080755c1edaf32f87528a18e9840.jpg@900w_1l_2o_100sh.jpg',
                        'url': '2'
                    }];
                    console.log(this.lunboList);
                } else {
                    Toast('加载数据失败')
                }


            }
        }
    }
</script>

<style lang="scss" scoped>


</style>