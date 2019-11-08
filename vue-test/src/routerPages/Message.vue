<template>
  <div>
    <router-link v-for="(value,index) in messageList" :key="index" :to="`/index/news/message/messageDetail/{{value.id}}`" :messageList="messageList">{{value.title}}</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
  export default {
    name: "Message",
    data() {
      return {
        messageList: []
      };
    },
    mounted() {
      this.messageList.push({id: 1, title: "haha", detail: "我了个去啊"});
      this.messageList.push({id: 2, title: "haha2", detail: "我了个去啊2"});
      this.messageList.push({id: 3, title: "haha3", detail: "我了个去啊2"});

    }


  }


</script>

<style scoped>

</style>
