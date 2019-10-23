<template>
  <div>
    <li v-for="(value,index) in todoList" :key="index">
      <label>
        <input type="checkbox" :checked="value.isCheck"/>
        <span>{{value.message}}</span>
      </label>
      <button class="btn btn-danger" style="display:none">删除</button>
    </li>
  </div>
</template>

<script>
  export default {
    props: {
      todoList: Array
    },
  };
</script>
