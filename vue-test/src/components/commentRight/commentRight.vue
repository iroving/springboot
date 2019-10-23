<template>
  <div class="col-md-8">
    <h3 class="reply">评论回复：</h3>
    <h2 v-show="commentList.length==0">暂无评论，点击左侧添加评论！！！</h2>
    <ul class="list-group">
      <li class="list-group-item" v-for="(value ,index) in commentList">
        <div class="handle">
          <a href="javascript:;"  @click="del(index)">删除</a>
        </div>
        <p class="user"><span >{{value.username}}</span><span>说:</span></p>
        <p class="centence">{{value.context}}</p>
      </li>
    </ul>
  </div>
</template>

<script>
    export default {
        props: {
          commentList:Array
        },
        methods:{
          del(index){
            this.commentList.splice(index, 1);
          }
        }

    };
</script>

<style>
  .reply {
    margin-top: 0px;
  }

  li {
    transition: .5s;
    overflow: hidden;
  }

  .handle {
    width: 40px;
    border: 1px solid #ccc;
    background: #fff;
    position: absolute;
    right: 10px;
    top: 1px;
    text-align: center;
  }

  .handle a {
    display: block;
    text-decoration: none;
  }

  .list-group-item .centence {
    padding: 0px 50px;
  }

  .user {
    font-size: 22px;
  }


</style>
