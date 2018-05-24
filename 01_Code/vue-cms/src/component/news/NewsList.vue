<template>
    <div>
        <ul class="mui-table-view">
            <li v-for="item in newslist" class="mui-table-view-cell mui-media" :key="item.id">
                <router-link :to="'/home/newsinfo/'+item.id">
                    <img class="mui-media-object mui-pull-left" :src="item.img">
                    <div class="mui-media-body">
                        <h1>{{item.title}}</h1>
                        <p class='mui-ellipsis'>
                            <span>发表时间：{{item.add_time|dateFormat}}</span><span>点击：{{item.click}}次</span>
                        </p>
                    </div>
                </router-link>
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: "news-list",
        data: function () {
            return {
                newslist: []
            };
        },
        created: function () {
            this.getNewsList();
        },
        methods:
            {
                getNewsList: function () {
                    // this.$http.get("/api/getlunbo").then(response => {
                    //     console.log("success:");
                    //     console.log(response);
                    // }, response => {
                    //     console.log("error:");
                    //     console.log(response);
                    // });
                    // this.newslist = [{
                    //     add_time: '2015-04-09',
                    //     click: 10,
                    //     id: 1,
                    //     img_url: 'http://img3.imgtn.bdimg.com/it/u=2249893882,1165836821&fm=27&gp=0.jpg',
                    //     title: '1季度多家房企利润跌幅超50%,去库存促销战打响',
                    //     zhaiyao: '房企一季度销售业绩已陆续公布，可瑞尔研究中心统计'
                    // }, {
                    //     add_time: '2015-04-10',
                    //     click: 18,
                    //     id: 2,
                    //     img_url: 'http://img05.tooopen.com/images/20150820/tooopen_sy_139205349641.jpg',
                    //     title: '去年中国卫星导航与位置服务产业产值达2550亿元',
                    //     zhaiyao: '《2018中国卫星导航与位置服务产业发展白皮书》今天在京发布，对2017年度我国卫星导航与位置服务产业现状及未来发展趋势做了全面汇总与解读。'
                    // }];
                    for (var i = 1; i < 30; i++) {
                        this.newslist.push(
                            {
                                add_time: '2015-04-09T03:02:01.0002Z',
                                click: 10,
                                id: i,
                                img_url: 'http://img3.imgtn.bdimg.com/it/u=2249893882,1165836821&fm=27&gp=0.jpg',
                                title: '1季度多家房企利润跌幅超50%,去库存促销战打响',
                                zhaiyao: '房企一季度销售业绩已陆续公布，可瑞尔研究中心统计'
                            }
                        );
                    }
                }
            }
    }
</script>

<style lang="scss" scoped>
    .mui-table-view {
        li {
            h1 {
                font-size: 14px;
            }
            .mui-ellipsis {
                font-size: 12px;
                color: #226aff;
                justify-content: space-between;
                display: flex;
            }
        }
    }
</style>