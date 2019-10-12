// vue.config.js
module.exports = {
    // 修改的配置
    // 将baseUrl: '/api',改为baseUrl: '/',
    publicPath: '/',
    // port: 8888,
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:8889',
                changeOrigin: true,
                ws: true,
                pathRewrite: {
                    '^/api': ''
                }
            }
        },
        // 端口号
        port: 8888
    }
}
// .env.development
// VUE_APP_BASE_API=/api