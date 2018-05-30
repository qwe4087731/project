<template>
    <div class="shopcar-container">
        <div class="goods-list">

            <div class="mui-card" v-for="(item, i) in shopcar" :key="item.id">
                <div class="mui-card-content">
                    <div class="mui-card-content-inner">
                        <!--这里使用了v-modal双向绑定，但是$store中的数据不能这样赋值，使用v-modal是因为是mt-switch标签的文档规定如此，
                        此时我们修改的是$store.getters中的getGoodsSelecte返回的对象，所以我们需要添加事件监听来绑定，并且把修改过的值传递过去-->
                        <mt-switch v-model="$store.getters.getGoodsSelected[item.id]"
                                   @change="selectedChanged(item.id, $store.getters.getGoodsSelected[item.id])"></mt-switch>
                        <img :src="item.img_url"/>
                        <div clas="info">
                            <h1>{{item.title}}</h1>
                            <p>
                                <span class="price">¥{{item.sell_price}}</span>
                                <numbox :initcount="$store.getters.getGoodsCount[item.id]" :goodsid="item.id"></numbox>
                                <a href="#" @click.prevent="remove(item.id, i)">删除</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="mui-card">
                <div class="mui-card-content">
                    <div class="mui-card-content-inner jiesuan">
                        <div class="left">
                            <p>总计(不包含运费)</p>
                            <p>已勾选商品<span class="red">{{$store.getters.getGoodsCountAndAmount.count}}</span>件，总价<span
                                    class="red">¥{{$store.getters.getGoodsCountAndAmount.amount}}</span></p>
                        </div>
                        <mt-button type="danger">去结算</mt-button>
                    </div>
                </div>
            </div>


        </div>
    </div>
</template>

<script>
    import numbox from '../subcomponent/shopcar_numbox.vue'

    export default {
        name: "shopcar",
        data: {
            shopcar: []
        },
        components: {
            numbox
        },
        created() {
            this.getShopCar();
        },
        methods: {
            getShopCar() {
                //传递参数ids，以逗号分割去获取购物车中的参数id
                var ids = [];
                this.$store.state.car.forEach(item =>
                    ids.push(item.id)
                )
                if (ids.length <= 0) {
                    return;
                }
                // this.$http.get("api/goods/getshopcarlist/" + ids.join(",")).then(result => {
                //     if(result.body.status == 0){
                //         this.goodslist = result.body.message;
                //     }
                // })
                var array = [{
                    id: 1,
                    title: '华为(HUAWEI)荣耀PLUS 16G',
                    img_url: 'http://img4.imgtn.bdimg.com/it/u=4063527091,1765948189&fm=27&gp=0.jpg',
                    sell_price: 2195,
                    count: 10
                }, {
                    id: 2,
                    title: '小米6S',
                    img_url: 'https://res.vmallres.com/pimages//sale/2018-04/2018042811131740.png',
                    sell_price: 1800,
                    count: 20
                }]
                this.shopcar = array;
            },

            remove(id, index) {
                this.shopcar.splice(index, 1);
                this.$store.commit("removeFormCar", id);
            },

            selectedChanged(id, val) {
                var goodsinfo = {
                    "id": id,
                    "selected": val
                };
                this.$store.commit('updateGoodsSelected', goodsinfo);
            }
        }
    }
</script>

<style lang="scss" scoped>
    .shopcar-container {
        background: #eee;
        overflow: hidden;
        .goods-list {
            .mui-card-content-inner {
                display: flex;
                align-items: center;
            }
            img {
                width: 60px;
                height: 60px;
            }
            h1 {
                font-size: 13px;
            }
            .info {
                display: flex;
                flex-direction: column;
                justify-content: space-between;
                .price {
                    color: red;
                    font-weight: bold;
                }
            }

        }
        .jiesuan {
            display: flex;
            justify-content: space-between;
            align-items: center;
            .red {
                color: red;
                font-weight: bold;
                font-size: 16px;
            }
        }

    }
</style>