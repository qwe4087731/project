<template>
    <div>
        <mt-swipe :auto="4000">
            <mt-swipe-item>1</mt-swipe-item>
            <mt-swipe-item>2</mt-swipe-item>
            <mt-swipe-item>3</mt-swipe-item>
        </mt-swipe>
        <h3>HomeContainer</h3></div>
</template>

<script>
    export default {
        name: "home",
        data: function () {
            return {};
        },
        created: function () {
            this.getLunbotu();
        },
        methods: {
            getLunbotu: function () {
                // this.$http.get("http://localhost/io/api/getlunbo").then(result => {
                //     console.log(result.body);
                // })
                console.log(123);
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
        }
    }

</style>