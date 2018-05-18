<template>
    <div>
        <mt-swipe :auto="4000">
            <mt-swipe-item v-for="item in lunboList" :key="item.url"><img :src="item.img"/></mt-swipe-item>
            <!--<mt-swipe-item>2</mt-swipe-item>-->
        </mt-swipe>
        <ul class="mui-table-view mui-grid-view mui-grid-9">
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-home"></span>
                <div class="mui-media-body">新闻资讯</div>
            </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-email"><span class="mui-badge">5</span></span>
                <div class="mui-media-body">图片分享</div>
            </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-chatbubble"></span>
                <div class="mui-media-body">商品购买</div>
            </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-location"></span>
                <div class="mui-media-body">留言反馈</div>
            </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-search"></span>
                <div class="mui-media-body">视频专区</div>
            </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4 mui-col-sm-3"><a href="#">
                <span class="mui-icon mui-icon-phone"></span>
                <div class="mui-media-body">联系我们</div>
            </a></li>
        </ul>
    </div>
</template>

<script>
    import {Toast} from 'mint-ui'

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
        methods: {
            getLunbotu: function () {
                // this.$http.get("http://localhost/io/api/getlunbo").then(response => {
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
    .mint-swipe {
        height: 200px;
        .mint-swipe-item {
            &:nth-child(1) {
                background: red;
            }
            &:nth-child(2) {
                background: blue;
            }
            &:nth-child(3) {
                background: green;

            }

            img {
                width: 100%;
                height: 100%;
            }
        }
    }

</style>