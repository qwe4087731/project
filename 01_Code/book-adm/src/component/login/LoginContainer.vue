<template>
    <div class="container">
        <div class="form-horizontal">
            <div class="form-group has-feedback"
                 :class="inputs.email.invalid === 0 ? '' : (inputs.email.invalid === 1 ? 'has-success' : 'has-error')">
                <label for="email" class="col-sm-2 control-label">Email</label>
                <div class="col-sm-6">
                    <input type="email" class="form-control" id="email" placeholder="Email"
                           v-model="inputs.email.text"
                           @blur.stop="onBlur">
                    <span v-if="inputs.email.invalid === 1"
                          class="glyphicon glyphicon-ok form-control-feedback"></span>
                    <!--<p class="help-block">{{inputs.email.errMsg}}</p>-->
                </div>
                <span class="help-block col-sm-2">{{inputs.email.errMsg}}</span>
                <!--<div class="col-sm-6 col-sm-offset-2"><span class="text-danger">{{inputs.email.errMsg}}</span></div>-->
            </div>
            <div class="form-group has-feedback"
                 :class="inputs.password.invalid === 0 ? '' : (inputs.password.invalid === 1 ? 'has-success' : 'has-error')">
                <label for="password" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" id="password" placeholder="Password"
                           v-model="inputs.password.text" @blur.stop="onBlur">
                    <span v-if="inputs.password.invalid === 1"
                          class="glyphicon glyphicon-ok form-control-feedback"></span>
                </div>
                <span class="help-block col-sm-2">{{inputs.password.errMsg}}</span>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" :disabled="disabled" @click="login">登录</button>
                </div>
            </div>
        </div>

        <!--<table>-->
        <!--<tr>-->
        <!--<td>用户名</td>-->
        <!--<td><input/></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td>密码</td>-->
        <!--<td><input/></td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td></td>-->
        <!--<td><input type="button" value="提交" @click="login"/></td>-->
        <!--</tr>-->
        <!--</table>-->
    </div>
</template>

<script>
    // import global from '../../global.js'

    export default {
        name: "login",
        data() {
            return {
                // email: "",
                // password: "",
                disabled: false,
                // emailInValid: false,
                // passwordInvalid: false
                inputs: {
                    email: {text: "", invalid: 0, errMsg: ""},
                    password: {text: "", invalid: 0, errMsg: ""},
                }
            }
        },

        created() {
        },


        methods: {
            verifyEmail() {
                var email = this.inputs.email;
                console.log("email:" + email.text);
                if (!email.text) {
                    email.invalid = -1;
                    email.errMsg = "邮箱地址不能为空";
                    return;
                }
                email.invalid = 1;
            },

            verifyPassword() {
                var password = this.inputs.password;
                console.log("password:" + password.text);
                if (!password.text) {
                    password.invalid = -1;
                    password.errMsg = "密码地址不能为空";
                    return;
                }
                password.invalid = 1;
            },

            onBlur(event) {
                if (event.target.id === "email") {
                    this.verifyEmail();
                } else if (event.target.id === "password") {
                    this.verifyPassword();
                }
            },
            login() {
                if (!this.email) {
                    this.emailInValid = true;
                    return;
                }
                if (!this.password) {
                    this.passwordInvalid = true;
                    return;
                }
                this.disabled = true;
                this.request('user/login.html', 'POST', {
                    username: this.email,
                    password: this.password
                }, data => {
                    // global.token = data.token;
                    console.log("登录成功");
                    this.$cookies.set("token", global.token,)
                    this.$router.push({
                        path: '/home'
                    });
                }, (errMsg, errCode) => {
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