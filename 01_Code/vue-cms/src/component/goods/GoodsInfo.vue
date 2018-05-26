<template>
    <div class="goodinfo-container">
        <transition @before-enter="beforeEnter" @enter="enter" @after-enter="afterEnter">
            <div class="ball" v-show="ballFlag"></div>
        </transition>
        <div class="mui-card">
            <div class="mui-card-content">
                <div class="mui-card-content-inner">
                    <swiper :lunbo-list="lunboList" :isfull="false"></swiper>
                </div>
            </div>
        </div>

        <div class="mui-card">
            <div class="mui-card-header">{{goodsinfo.title}}</div>
            <div class="mui-card-content">
                <div class="mui-card-content-inner">
                    <p class="price">
                        市场价：
                        <del>¥{{goodsinfo.market_price}}</del>&nbsp;&nbsp;销售价：<span class="now_price">¥{{goodsinfo.sell_price}}</span>
                    </p>
                    <p>购买数量：
                        <numbox :maxnum="goodsinfo.stock_quantity"></numbox>
                    </p>
                    <p>
                        <mt-button type="primary" size="small">立即购买</mt-button>
                        <mt-button type="danger" size="small" @click="addToShopCar">加入购物车</mt-button>
                    </p>
                </div>
            </div>
        </div>

        <div class="mui-card">
            <div class="mui-card-header">商品参数</div>
            <div class="mui-card-content">
                <div class="mui-card-content-inner">
                    <p>商品货号：{{goodsinfo.goods_no}}</p>
                    <p>库存情况：{{goodsinfo.stock_quantity}}</p>
                    <p>上架时间：{{goodsinfo.add_time|dateFormat}}</p>
                </div>
            </div>
            <div class="mui-card-footer">
                <mt-button type="primary" size="large" plain="" @click="goDesc(id)">图文介绍</mt-button>
                <mt-button type="danger" size="large" plain="" @click="goComment(id)">商品评论</mt-button>
            </div>
        </div>

    </div>
</template>

<script>
    import swiper from '../subcomponent/swiper.vue'
    import numbox from '../subcomponent/goodsinfo_numbox.vue'

    export default {
        name: "goods-info",
        data() {
            return {
                id: this.$route.params.id,
                lunboList: [],
                goodsinfo: {},
                ballFlag: false
            }
        },
        created() {
            this.getLunbotu();
            this.getGoodsInfo();
        },
        components: {
            swiper,
            numbox
        },
        methods: {
            getLunbotu() {
                // this.$http.get('api/getthumbimages/' + this.id).then(result => {
                //     if (result.body.status = 0) {
                //         this.lunbotu = result.body.message;
                //     }
                // })


                this.lunboList = [{
                    'src': 'http://img.zcool.cn/community/018c3d59ac137da801211d25932cbd.jpg@1280w_1l_2o_100sh.png',
                    'url': '1'
                }, {
                    'src': 'http://img.zcool.cn/community/01080755c1edaf32f87528a18e9840.jpg@900w_1l_2o_100sh.jpg',
                    'url': '2'
                }];
                this.lunboList.forEach(item => {
                    item.img = item.src;
                });
            },

            getGoodsInfo() {
                // this.$http.get('api/goods/getinfo' + this.id).then(result => {
                //     if (result.body.status == 0) {
                //         this.goodsinfo = result.body.message;
                //     }
                // })
                this.goodsinfo = {
                    add_time: '2015-07-08',
                    goods_no: "SD298883899",
                    id: 83,
                    market_price: 2600,
                    sell_price: 2199,
                    stock_quantity: 60,
                    title: "小米(Mi)小米Note 16G双网通版"
                }
            },

            goDesc(id) {
                this.$router.push({
                    name: "goodsdesc",
                    params: {
                        id
                    }
                })
            },

            goComment(id) {
                this.$router.push({
                    name: "goodscomment",
                    params: {
                        id
                    }
                })
            },

            addToShopCar() {
                this.ballFlag = !this.ballFlag;
            },

            beforeEnter(el) {
                console.log("before enter");
                el.style.transform = "translate(0, 0)";
            },

            enter(el, done) {
                console.log("enter");
                el.offsetWidth;
                el.style.transform = "translate(93px,205px)";
                el.style.transition = "all 1s ease";
                done();
            },

            afterEnter(el) {
                console.log("after enter");
                this.ballFlag = !this.ballFlag;
            }
        }

    }
</script>

<style lang="scss" scoped>
    .goodinfo-container {
        background: #ccc;
        margin: 0;
        .now_price {
            color: red;
            font-size: 16px;
            font-weight: bold;
        }

        .mui-card-footer {
            display: block;
            button {
                margin: 10px;
            }
        }

        .ball {
            width: 15px;
            height: 15px;
            border-radius: 50%;
            background: red;
            position: absolute;
            z-index: 99;
            top: 390px;
            left: 146px;
        }
    }
</style>