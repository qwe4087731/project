<template>
    <div class="mui-numbox" data-numbox-min='1' :data-numbox-max='maxnum'>
        <button class="mui-btn mui-btn-numbox-minus" type="button">-</button>
        <input id="test" class="mui-input-numbox" type="number" value="1" @change="countChanged" ref="numbox"/>
        <button class="mui-btn mui-btn-numbox-plus" type="button">+</button>
    </div>
</template>

<script>
    import mui from '../../lib/mui/js/mui.min.js'

    export default {
        name: "goodsinfo",
        props: ["maxnum"],
        watch: {
            'maxnum': function (newVal, oldVal) {
                mui('.mui-numbox').setOption("maxnum", newVal);
            }
        },
        mounted() {
            mui('.mui-numbox').numbox()
        },
        methods: {
            countChanged() {
                var num = this.$refs.numbox.value;
                this.$emit("getcount", parseInt(num));
            }
        }

    }
</script>

<style lang="scss" scoped>

</style>