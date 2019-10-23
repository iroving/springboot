<template>
    <div class="CommentAll">
      <commentHeader></commentHeader>
      <div class="container">
        <commentLeft :commentList="commentList"></commentLeft>
        <commentRight :commentList="commentList"></commentRight>
      </div>
    </div>
</template>

<script>
    import commentHeader from "../commentHeader/commentHeader"
    import commentLeft from "../commentLeft/commentLeft"
    import commentRight from "../commentRight/commentRight"
    export default {
        // props: {
        // },
      components: {
        commentLeft: commentLeft,
        'commentRight':commentRight,
        'commentHeader':commentHeader
      },
      data(){
        return{
          commentList:[]
        }
      }
    };
</script>

<style>
  @import "../../bootstrap.css";
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
