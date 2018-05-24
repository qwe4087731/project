<template>
    <div>
        <div id="slider" class="mui-slider">
            <div id="sliderSegmentedControl"
                 class="mui-scroll-wrapper mui-slider-indicator mui-segmented-control mui-segmented-control-inverted">
                <div class="mui-scroll">
                    <!--这里的a使用click事件可能在真正的手机浏览器中有bug，mui通常会使用tap事件-->
                    <a v-for="item in category" :key="item.id"
                       :class="['mui-control-item', item.id == 0 ? 'mui-active' : ''] "
                       @click="getPhotoListByCateId(item.id)">
                        {{item.title}}
                    </a>
                </div>
            </div>
        </div>

        <ul class="photo-list">
            <router-link :to="'/home/photoinfo/'+item.id" v-for="item in list" :key="item.id" tag="li">
                <img v-lazy="item.img_url"/>
            </router-link>
        </ul>
    </div>
</template>

<script>
    //这句话严格模式下会报错，因为mui.min.js会访问caller等属性，而webpack打包成bundle.js会启用严格模式，
    // 所以报错Uncaught TypeError: 'caller', 'callee', and 'arguments' properties
    // may not be accessed on strict mode functions or the arguments objects for calls to them
    //所以解决方案去除掉mui.min.js中的这些相关代码(b不现实)或者webpack禁用严格模式：
    //1.webpack禁用严格模式
    import mui from '../../lib/mui/js/mui.min.js'

    export default {
        name: "photo-list",
        created: function () {
            this.getAllCategory();
            this.getPhotoListByCateId(0);
        },
        mounted: function () {
            mui('.mui-scroll-wrapper').scroll({
                deceleration: 0.0005 //flick 减速系数，系数越大，滚动速度越慢，滚动距离越小，默认值0.0006
            });
        },
        data: function () {
            return {
                category: [],
                list: []
            };
        },
        methods: {
            getAllCategory: function () {
                // this.$http.get("api/getimgcategory").then(result => {
                //     if (result.body.status === 0) {
                //         result.body.message.unshift({title: '全部', id: 0})
                //     }
                // })
                this.category = this.category.concat([
                    {
                        title: '家居生活',
                        id: 1
                    },
                    {
                        title: '摄影设计',
                        id: 2
                    },
                    {
                        title: '明星美女',
                        id: 3
                    },
                    {
                        title: '空间设计',
                        id: 4
                    },
                    {
                        title: '户型装饰',
                        id: 5
                    },
                    {
                        title: '广告摄影',
                        id: 6
                    },
                    {
                        title: '摄影学习',
                        id: 7
                    },
                    {
                        title: '摄影器材',
                        id: 8
                    },
                    {
                        title: '明星写真',
                        id: 9
                    },
                    {
                        title: '清纯甜美',
                        id: 10
                    },
                    {
                        title: '古典美女',
                        id: 11
                    }
                ]);
                this.category.unshift({title: '全部', id: 0});
            },
            getPhotoListByCateId: function (cateId) {
                // this.$http.get('api/getimages/' + cateId).then(result => {
                //     if (result.body.status === 0) {
                //         this.list = result.body.message;
                //     }
                // })
                var index = 1;
                this.list.length = 0;
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img4.imgtn.bdimg.com/it/u=4063527091,1765948189&fm=27&gp=0.jpg'
                })
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img4.imgtn.bdimg.com/it/u=163384988,632805464&fm=27&gp=0.jpg'
                })
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img0.imgtn.bdimg.com/it/u=3577930045,2595980619&fm=27&gp=0.jpg'
                })
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img2.imgtn.bdimg.com/it/u=3412247870,1641633742&fm=11&gp=0.jpg'
                })
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img5.imgtn.bdimg.com/it/u=2155383765,2652738918&fm=27&gp=0.jpg'
                })
                this.list.push({
                    'id': index++,
                    'img_url': 'http://img5.imgtn.bdimg.com/it/u=434955855,1226526860&fm=27&gp=0.jpg'
                })
                if (cateId == 1) {
                    this.list.length = 0;
                }
            }
        }
    }
    //放到这里有问题，当切换到此route-view的时候，此时因为组件中的DOM结构还没有被渲染出来，
    // 所以放到这里会有问题，我们必须在组件DOM渲染完成的时候在调用下面代码进行初始化
    // mui('.mui-scroll-wrapper').scroll({
    //     deceleration: 0.0005 //flick 减速系数，系数越大，滚动速度越慢，滚动距离越小，默认值0.0006
    // });
</script>

<style lang="scss" scoped>
    .mint-header {
        z-index: 2;
    }

    .photo-list {
        list-style: none;
        margin: 0;
        padding: 10px;
        padding-bottom: 0;
        li {
            background-color: #ccc;
            margin-bottom: 10px;
            box-shadow: 0 0 9px #999;
            img {
                width: 100%;
                vertical-align: middle;
            }
            img[lazy='loading'] {
                width: 40px;
                height: 300px;
                margin: auto;
            }
        }
    }
</style>