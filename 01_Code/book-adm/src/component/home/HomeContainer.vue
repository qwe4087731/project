<template>
    <div>
        <header>
            <nav>
                <dl>
                    <dt>爬虫维护</dt>
                    <dd></dd>
                </dl>
                <dl>
                    <dt>小说维护</dt>
                    <dd></dd>
                </dl>
            </nav>
        </header>
        <aside>
            <div>{{userInfo.name}}</div>
            <nav>
                <ul>
                    <li>退出系统</li>
                    <li>修改密码</li>
                    <li>关于我们</li>
                </ul>
            </nav>
        </aside>
    </div>
</template>

<script>

    export default {
        name: "home-container",
        data() {
            return {
                userInfo: {}
            }
        },
        created() {
            this.getUserInfo();
        },

        methods: {
            getUserInfo() {
                // this.$http.get('api/getUserInfo').then(result => {
                //     var data = result.body;
                //     if (data[0] == 1) {
                //         global.user_token = data[2].token;
                //         this.$router.push({
                //             path: '/home'
                //         });
                //     } else if (data[0] == -1) {
                //         this.$router.push({
                //             path: '/login'
                //         });
                //     } else {
                //         console.log("获取用户信息失败");
                //     }
                // }, result => {
                //     console.log("获取用户信息失败");
                // });

                var that = this;
                this.request('user/info.html', 'POST', null, function (data) {
                    that.userInfo = data;
                    // console.log(data);
                }, function (errMsg, errCode) {
                    console.log("读取用戶信息失敗");
                });
            }
        }
    }
</script>

<style scoped>

</style>