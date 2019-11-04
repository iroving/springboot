<template>
  <ul class="todo-main">
    <toDosItem v-for="(value,index) in todoList" :key="index" :todoList="todoList" :delTodo="delTodo" :value="value"></toDosItem>
  </ul>


</template>

<script>
  import toDosItem from '../toDosItem/toDosItem'

  export default {
    props: {
      todoList: Array,
      delTodo: Function
    },
    components:{
      toDosItem
    }
  };
</script>
