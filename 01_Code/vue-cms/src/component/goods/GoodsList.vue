<template>
    <div class="goods-list">
        <!--<router-link class="goods-item" v-for="item in list" :key="item.id" :to="'/home/goodsinfo/' + item.id"-->
        <!--tag="div">-->
        <!--<img :src="item.img_url"/>-->
        <!--<h1 class="title">{{item.title}}</h1>-->
        <!--<div class="info">-->
        <!--<p class="price"><span class="now">{{item.sell_price}}</span><span-->
        <!--class="old">{{item.market_price}}</span></p>-->
        <!--<p class="sell"><span class="now">热卖中</span><span class="old">剩{{item.stock_quantity}}件</span></p>-->
        <!--</div>-->
        <!--</router-link>-->

        <div class="goods-item" v-for="item in list" :key="item.id" @click="getDetail(item.id)">
            <img :src="item.img_url"/>
            <h1 class="title">{{item.title}}</h1>
            <div class="info">
                <p class="price"><span class="now">{{item.sell_price}}</span><span
                        class="old">{{item.market_price}}</span></p>
                <p class="sell"><span class="now">热卖中</span><span class="old">剩{{item.stock_quantity}}件</span></p>
            </div>
        </div>
        <mt-button type="danger" size="large" @click="getGoodsList">加载更多</mt-button>
    </div>
</template>

<script>
    export default {
        name: "good-list",
        data: function () {
            return {
                list: []
            }
        },
        created() {
            this.getGoodsList();
        },
        methods: {
            getGoodsList() {
                this.list = this.list.concat([{
                    id: 1,
                    add_time: '2015-04-09T03:02:01.0002Z',
                    title: '华为(HUAWEI)荣耀PLUS 16G',
                    zhaiyao: '荣耀6PLUS，该机型分为2款型号',
                    click: 0,
                    img_url: 'http://img4.imgtn.bdimg.com/it/u=4063527091,1765948189&fm=27&gp=0.jpg',
                    sell_price: 2195,
                    market_price: 2499,
                    stock_quantity: 60
                }, {
                    id: 2,
                    add_time: '2015-04-09T03:02:01.0002Z',
                    title: '小米6S',
                    zhaiyao: '小米6S最新上市',
                    click: 0,
                    img_url: 'https://res.vmallres.com/pimages//sale/2018-04/2018042811131740.png',
                    sell_price: 1800,
                    market_price: 2000,
                    stock_quantity: 30
                }]);
            },
            getDetail(id) {
                // this.$router.push('/home/goodsinfo/' + id);
                // this.$router.push({
                //     path: '/home/goodsinfo/' + id
                // });
                //这里的name必须在router.js里面配置一个名为goodsinfo的router对象，params因为名字为id，value也为id，所以可以简写为id
                this.$router.push({
                    name: 'goodsinfo',
                    params: {id}
                });
                //使用path的话，params会被忽略，只能使用query传递参数或者直接跟在path后面
                this.$router.push({
                    path: '/home/goodsinfo/',
                    query: {id}
                });
            }
        }
    }
</script>

<style lang="scss" scoped>
    .goods-list {
        display: flex;
        flex-wrap: wrap;
        padding: 7px;
        justify-content: space-between;
        .goods-item {
            width: 49%;
            border: 1px solid #ccc;
            box-shadow: 0 0 8px #ccc;
            margin: 4px 0;
            padding: 2px;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            min-height: 293px;
            img {
                width: 100%;
            }
            .title {
                font-size: 14px;
            }

            .info {
                background: #eee;
                p {
                    margin: 0;
                    padding: 5px;
                }
                .price {
                    .now {
                        color: red;
                        font-weight: bold;
                        font-size: 16px;
                    }
                    .old {
                        text-decoration: line-through;
                        font-size: 12px;
                        margin-left: 10px;
                    }
                }

                .sell {
                    display: flex;
                    justify-content: space-between;
                    font-size: 13px;
                }
            }
        }
    }
</style>