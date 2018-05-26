<template>
    <div class="newsinfo-container">
        <h3 class="title">{{newsinfo.title}}</h3>
        <p class="subtitle">
            <span>发表时间：{{newsinfo.add_time|dateFormat}}</span>
            <span>点击次数：{{newsinfo.click}}次</span>
        </p>
        <hr/>

        <div class="content" v-html="newsinfo.content"></div>
        <comment-box :id="this.id"></comment-box>
    </div>

</template>

<script>
    import Comment from '../subcomponent/Comment.vue'

    export default {
        name: "news-info",
        data: function () {
            return {
                id: this.$route.params.id,
                newsinfo: {}
            };
        },
        components: {
            'comment-box': Comment
        },
        created: function () {
            this.getNewsInfo();
        },
        methods: {
            getNewsInfo: function () {
                this.newsinfo = {
                    id: this.id,
                    title: '去年中国卫星导航与位置服务产业产值达2550亿元',
                    click: 2,
                    add_time: '2015-04-09T03:02:01.0002Z',
                    content: '原标题：2018中国卫星导航与位置服务产业发展白皮书：产值达2550亿元\n' +
                    '\n' +
                    '​《2018中国卫星导航与位置服务产业发展白皮书》今天在京发布，对2017年度我国卫星导航与位置服务产业现状及未来发展趋势做了全面汇总与解读。\n' +
                    '\n' +
                    '<img src="http://p3.ifengimg.com/fck/2018_20/aa5ff923d332055_w677_h504.png" />数据显示：2017年我国卫星导航与位置服务产业总体产值已达到2550亿元，较2016年增长20.4%。\n' +
                    '\n' +
                    '在国家北斗发展战略的引领下，我国卫星导航与位置服务产业正处于高速发展时期。5年来，北斗卫星导航系统已广泛应用于交通、海事、电力、民政、气象等十几个行业领域，各类国产北斗终端产品推广应用已累计超过4000万台/套，包括智能手机在内的采用北斗兼容芯片的终端产品社会用户总保有量接近5亿台/套。\n' +
                    '\n' +
                    '《白皮书》显示：目前，国内卫星导航及北斗应用产业链条日趋完善，产业规模持续扩大。国内卫星导航设备营销总规模相较于全球市场，占比逐年提高，已接近15%。\n' +
                    '\n' +
                    '今年，我国计划共发射18颗左右“北斗三号”组网卫星，优先为“一带一路”沿线国家和地区优先提供服务，到2020年底，将建成35颗卫星的全球覆盖系统，为全球用户提供定位、导航等服务。\n' +
                    '\n' +
                    '新闻多看点\n' +
                    '\n' +
                    '世界四大卫星导航系统\n' +
                    '\n' +
                    '说到卫星导航，大家最为熟悉的就是上世纪九十年代开始为人们所知的GPS。实际上，目前全球范围内已经有包括我国的“北斗”在内的四个卫星导航系统正式投入使用，我们一起来了解一下。车载导航仪今天已经高度普及，但您可能不曾想过，您使用的服务来自与一个和“阿波罗登月”齐名的空间工程：美国的全球卫星定位系统——GPS。1990年，这个由24颗卫星组成的系统组网完成。\n' +
                    '\n' +
                    '1994年美国宣布，向全世界免费提供精度达到10米的定位信号，这也就意味着只要装配了GPS接收机，其他国家无需再花钱发射卫星，就可以享受到高精度定位服务。\n' +
                    '\n' +
                    '然而，世界各大国研发自主卫星定位系统的脚步并没有因此停止，俄罗斯建立了本国的“格洛纳斯”卫星导航系统，欧洲的“伽利略”卫星导航系统也在坚持推进。此外，日本，印度等国都在推进自己的卫星导航系统的研制。\n' +
                    '\n' +
                    '要建立自主的全球卫星导航系统，其实并不是一件容易的事。俄罗斯的“格洛纳斯”系统基本和GPS同时开始发展，然而完成组网的时间却晚了30多年。雄心勃勃的欧洲“伽利略”工程，更是在欧债危机的拖累下缓慢前进，已经被起步更晚的中国北斗所超越。这也证明，卫星导航系统的建设是对国家综合国力的全面考验。（央视记者张雷）'
                };
            }
        },

    }
</script>

<!--这里必须把scoped去掉，否则的话img100%不生效-->
<!--因为加上scoped会为当前模板中的所有的html标签都加上一个data-v-xxx属性，-->
<!--对应的css样式就会如下：-->
<!--.newsinfo-container[data-v-4e50e0f5]-->
<!--.newsinfo-container .title[data-v-4e50e0f5]-->
<!--.newsinfo-container .subtitle[data-v-4e50e0f5]-->
<!--.content img[data-v-4e50e0f5]-->
<!--而这里的img不是不是当前模板中的html标签，而是v-html中的动态添加的标签，-->
<!--所以img没有没有data-v-xxx属性。-->
<!--.content img[data-v-4e50e0f5]{width:100%}就不会生效-->
<!--https://segmentfault.com/a/1190000012184604?utm_source=tuicool&utm_medium=referral-->
<!--https://vue-loader-v14.vuejs.org/zh-cn/features/scoped-css.html 解决方案-->
<style lang="scss" scoped>
    .newsinfo-container {
        padding: 0 4px;
        .title {
            font-size: 16px;
            text-align: center;
            margin: 15px 0;
            color: red;
        }
        .subtitle {
            font-size: 13px;
            color: #226aff;
            display: flex;
            justify-content: space-between;
        }

        /*scss使用 /deep/ ，如果是css，使用.content > > > img*/
        .content /deep/ img {
            width: 100%;
        }
    }
</style>