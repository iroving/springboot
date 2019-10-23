<template>
    <div class="todo-header">
      <input type="text" placeholder="请输入你的任务名称，按回车键确认" v-model="todo" @keypress.enter="headerAddTodo"/>
    </div>
</template>

<script>
  export default {
     props: {
       todoList:Array,
       addTodo:Function
     },
    data(){
      return {
        todo:''
      };
    },
    methods:{
      headerAddTodo(){
        let todoItem = {};
        todoItem.isCheck = false;
        todoItem.message = this.todo;
        this.addTodo(todoItem);
      }
    }
  };
</script>
