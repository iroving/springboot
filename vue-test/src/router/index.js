import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import commentAll from '@/components/commentAll/commentAll'
import toDosAll from '@/components/toDosAll/toDosAll'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/commentAll',
      name: 'commentAll',
      component: commentAll
    },
    {
      path: '/toDosAll',
      name: 'toDosAll',
      component: toDosAll
    }
  ]
})
