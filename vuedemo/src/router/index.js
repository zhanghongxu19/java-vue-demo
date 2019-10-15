import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Login from '@/components/Login'
import AppIndex from "@/components/home/AppIndex"

export default new Router({
    routes: [
        {
            path: '/login',
            name: 'Login',
            component: Login
        },
        {
            path: '/index',
            name: 'AppIndex',
            component: AppIndex
        },
        {
            path: '/',
            redirect: '/login'
        }
    ]
})