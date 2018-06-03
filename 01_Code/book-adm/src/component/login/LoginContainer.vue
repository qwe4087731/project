<template>
    <div class="container">
        <table>
            <tr>
                <td>用户名</td>
                <td><input/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="button" value="提交" @click="login"/></td>
            </tr>
        </table>
    </div>
</template>

<script>
    import global from '../../global.js'

    export default {
        name: "login",
        data() {
            return {}
        },

        created() {
        },

        methods: {
            login() {
                var that = this;
                this.request('user/login.html', 'POST', {
                    username: 'zhangsan',
                    password: "123456"
                }, function (data) {
                    global.token = data.token;
                    console.log("登录成功");
                    that.$cookies.set("token", global.token, )
                    that.$router.push({
                        path: '/home'
                    });
                }, function (errMsg, errCode) {
                    console.log("登录失败");
                    console.log(errMsg);
                    console.log(errCode);
                });
            }
        }
    }
</script>

<style scoped>
    /*.container {*/
    /*background: #017012;*/
    /*}*/
</style>