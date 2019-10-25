<template>
  <div class="todo-footer">
    <label>
      <input type="checkbox" v-model="allFinished"/>
    </label>
    <span>
          <span>已完成{{hasComplete}}</span> / 全部{{todoList.length}}
        </span>
    <button class="btn btn-danger">清除已完成任务</button>
  </div>
</template>

<script>
  export default {
    props: {
      todoList: Array
    },
    computed: {
      hasComplete:{
        get(){
          return this.todoList.filter((value, index) => {
            if (value.isCheck) {
              return value;
            }
          }).length;
        },
        set(){

        }
      },
      allFinished: {
        get(){
          return this.todoList.length == this.hasComplete && this.todoList.length != 0;
        },
        set(value) {
          if (value) {
            this.todoList.forEach(x => x.isCheck = true);
          } else {
            this.todoList.forEach(x => x.isCheck = false);
          }
        }



      }
    }
  };
</script>
