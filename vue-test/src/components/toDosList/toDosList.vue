<template>
  <ul class="todo-main">
    <toDosItem></toDosItem>
  </ul>


</template>

<script>
  import toDosItem from '../toDosItem/toDosItem'

  export default {
    props: {
      todoList:todoList
    },
  };
</script>
