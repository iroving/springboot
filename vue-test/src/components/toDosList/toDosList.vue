<template>
  <ul class="todo-main">
    <toDosItem></toDosItem>
  </ul>


</template>

<script>
  import toDosItem from '../toDosItem/toDosItem'

  export default {
    props: {
      todoList:Array
    },
    components:{
      toDosItem
    }
  };
</script>
