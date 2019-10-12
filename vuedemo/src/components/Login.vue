<template>
    <div>
        用户名：<input type="text" v-model="loginForm.username" placeholder="请输入用户名">
        密码：<input type="password" v-model="loginForm.password" placeholder="请输入密码">
        <button v-on:click="login">登陆</button>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                loginForm: {
                    username: '',
                    password: '',
                },
                responseResult: []
            }
        },
        methods: {
            login() {
                this.$router.replace({path: '/index'})
                // this.$axios
                //     .post('/login', {
                //         username: this.loginForm.username,
                //         password: this.loginForm.password
                //     })
                //     .then(successResponse => {
                //         if (successResponse.data.code === 200) {
                //             this.$router.replace({path: '/index'})
                //         }
                //     })
                //     .catch(failResponse => {
                //     })
            }
        }
    }
</script>

<style scoped>

</style>