<template>
  <div>
    <div>
      <router-link to="/index/about">about</router-link>
      <router-link to="/index/news">news</router-link>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
  import about from '@/routerPages/about'
  import news from './news'
  // import news from 'news'
  export default {
    name: "index",
    // props:{
    //
    // }
    components: {
      about: about,
      news: news
    }

  }
</script>

<style scoped>

</style>
