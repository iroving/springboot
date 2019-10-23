<template>
  <li>
    <label>
      <input type="checkbox"/>
      <span>xxxxx</span>
    </label>
    <button class="btn btn-danger" style="display:none">删除</button>
  </li>
</template>

<script>
    export default {
        props: {
          todoList:todoList
        },
    };
</script>
