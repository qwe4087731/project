<template>
    <div>
        <!--首页使用的swiper和商品详情中的swiper的图片展示不一样，首页图片需要宽高都100%，商品详情中需要高100%，宽自适应-->
        <!--所以我们定义一个属性isfull，由用户指定是否为100%的宽度。-->
        <mt-swipe :auto="4000">
            <mt-swipe-item v-for="item in lunboList" :key="item.url"><img :src="item.img" :class="{full:isfull}"/>
            </mt-swipe-item>
        </mt-swipe>
    </div>
</template>

<script>
    export default {
        name: "swiper",
        props: ["lunboList", "isfull"]

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
                height: 100%;
            }
        }
    }

    .full {
        width: 100%;
    }
</style>