<template>
  <div class="toDosAll">
        <toDosHeader :todoList="todoList" :addTodo="addTodo"></toDosHeader>
        <toDosList :todoList="todoList"></toDosList>
        <toDosFooter :todoList="todoList"></toDosFooter>
    </div>
</template>

<script>
  import toDosHeader from '../toDosHeader/toDosHeader'
  import toDosList from '../toDosList/toDosList'
  import toDosFooter from '../toDosFooter/toDosFooter'
    export default {
        // props: {
        // },
      data(){
          return {
            todoList:[]
          }
      },
      components:{
        toDosHeader:toDosHeader,
        toDosList:toDosList,
        toDosFooter:toDosFooter
      },
      methods:{
        addTodo(todoItem){
          this.todoList.push(todoItem);
        }
      }
    };
</script>
<style>
  @import "../../toDos.css";

</style>


