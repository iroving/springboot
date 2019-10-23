<template>
  <div class="todo-footer">
    <label>
      <input type="checkbox"/>
    </label>
    <span>
          <span>已完成0</span> / 全部{{todoList.length}}
        </span>
    <button class="btn btn-danger">清除已完成任务</button>
  </div>
</template>

<script>
    export default {
        props: {
          todoList:todoList
        },
    };
</script>
