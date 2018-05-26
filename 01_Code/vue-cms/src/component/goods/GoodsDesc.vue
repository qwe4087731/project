<template>
    <div class="goodsdesc-container">
        <h3>{{info.title}}</h3>
        <hr>
        <div class="content" v-html="info.content"></div>
    </div>
</template>

<script>
    export default {
        name: "goods-desc",
        data() {
            return {
                info: {}
            }
        },
        created() {
            this.getGoodsDesc();
        },
        methods: {
            getGoodsDesc() {
                this.info = {
                    title: '小米(Mi)小米Note 16G双网通版',
                    content: "<p>小米xxx大甩卖</p>"
                }
            }
        }

    }
</script>


<style lang="scss" scoped>
    .goodsdesc-container {
        padding: 4px;
        h3 {
            font-size: 16px;
            color: #226aff;
            text-align: center;
            margin: 15px 0;
        }

        .content /deep/ img {
            width: 100%;
        }
    }
</style>