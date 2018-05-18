<template>
    <div class="app-container">
        <mt-header fixed title="顶部导航"></mt-header>
        <transition>
            <router-view></router-view>
        </transition>
        <nav class="mui-bar mui-bar-tab">
            <router-link class="mui-tab-item" to="/home">
                <span class="mui-icon mui-icon-home"></span>
                <span class="mui-tab-label">首页</span>
            </router-link>
            <router-link class="mui-tab-item" to="/member">
                <span class="mui-icon mui-icon-contact"></span>
                <span class="mui-tab-label">会员</span>
            </router-link>
            <router-link class="mui-tab-item" to="/shopcar">
                <span class="mui-icon mui-icon-extra mui-icon-extra-cart"><span class="mui-badge">9</span></span>
                <span class="mui-tab-label">购物车</span>
            </router-link>
            <router-link class="mui-tab-item" to="/search">
                <span class="mui-icon mui-icon-search"></span>
                <span class="mui-tab-label">搜索</span>
            </router-link>
        </nav>
    </div>
</template>

<script>
    export default {
        data: function () {
            return {
                msg: '123'
            }
        },
        methods: {
            show: function () {
                console.log("调用login组件的show方法");
            }
        }

    }
</script>

<style lang="scss" scoped>
    .app-container {
        padding-top: 40px;
        // 一个组件向外移动，一个组件向内移动，此时设置如果宽度超过隐藏
        overflow-x: hidden;
    }

    //v-enter和v-leave-totranslateX不一样，是为了让进入的从右边进去，出去的从左边出去
    .v-enter {
        opacity: 0;
        transform: translateX(100%);
    }

    // 一个组件向外移动，一个组件向内移动，当同时2个组件都在屏幕内的时候，此时相当于向内移动的会放到向外移动的
    //这里设置position是为了让向外移动的清除文档流，这样向内的就会在最上面开始进入。
    .v-leave-to {
        opacity: 0;
        transform: translateX(-100%);
        position: absolute;
    }

    .v-enter-active, .v-leave-active {
        transition: all 0.5s ease;
    }
</style>