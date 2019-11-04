<template>
  <div>
    <li @mouseenter="changeStyle(true)" @mouseleave="changeStyle(false)">
      <label>
        <input type="checkbox" v-model="value.isCheck"/>
        <span>{{value.message}}</span>
      </label>
      <button class="btn btn-danger" @click="delTodoItem(key)" v-show="isShow">删除</button>
    </li>
  </div>
</template>

<script>
  export default {
    props: {
      todoList: Array,
      delTodo: Function,
      key: Number,
      value: Object
    },
    data(){
      return {
        isShow: false
      };
    },
    methods: {
      delTodoItem(index){
        this.delTodo(index);
      },
      changeStyle(flag){
        if (flag) {
          this.isShow = true;
        } else {
          this.isShow = false;
        }
      }
    }

  };
</script>
