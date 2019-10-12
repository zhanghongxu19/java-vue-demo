import Vue from 'vue'
import App from './App.vue'
import router from './router'

// 前端请求默认发送到 http://localhost:8889/api
var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8889/api'
// 全局注册，之后可在其他组件中通过 this.$axios 发送数据
Vue.prototype.$axios = axios

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
