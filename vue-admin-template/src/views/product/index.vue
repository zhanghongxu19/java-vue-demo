<template>
  <div class="app-container">
    <div class="address-layout">
      <el-row :gutter="30">
        <el-col :span="6">
          <div class="out-border">
            <div class="layout-title">后台项目</div>
            <div class="color-main address-content">
              <a href="">mall</a>
            </div>
          </div>
        </el-col>
        <el-col :span="6">
          <div class="out-border">
            <div class="layout-title">前端项目</div>
            <div class="color-main address-content">
              <a href="">main-admin-web</a>
            </div>
          </div>
        </el-col>
        <el-col :span="6">
          <div class="out-border">
            <div class="layout-title">标题</div>
            <div class="color-main address-content">
              <a href="">内容</a>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'productList'
  }
</script>

<style scoped>
  .app-container {
    margin: 40px 120px auto 120px;
  }

  .address-layout {}

  .out-border {
    border: 1px solid #DCDFE6;
  }

  .layout-title {
    color: #606266;
    padding: 15px 20px;
    background: #F2F6FC;
    font-weight: bold;
    text-align: center;
  }

  .address-content {
    padding: 20px;
    font-size: 18px;
  }
</style>
