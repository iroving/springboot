<template>
    <div class="toDosAll">
        <toDosHeader :todoList="todoList"></toDosHeader>
        <toDosList :todoList="todoList"></toDosList>
        <toDosFooter :todoList="todoList"></toDosFooter>
    </div>
</template>

<script>
  import toDosHeader from '../toDosHeader/toDosHeader'
  import toDosList from '../toDosList/toDosList'
  import toDosFooter from '../toDosFooter/toDosFooter'
    export default {
        props: {
        },
      data(){
          return {
            todoList:[]
          };
      }
    };
</script>
<style>
  @import "../../toDos.css";

</style>


