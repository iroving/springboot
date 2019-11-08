import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import commentAll from '@/components/commentAll/commentAll'
import toDosAll from '@/components/toDosAll/toDosAll'
import indexPage from '@/routerPages/index'
import about from '@/routerPages/about'
import news from '@/routerPages/news'

import message from '@/routerPages/Message'
import messageDetail from '../routerPages/MessageDetail'

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
    },
    {
      path: '/index',
      name: 'index',
      component: indexPage,
      children:[
        {
          path: 'about',
          name: 'about',
          component: about
        },
        {
          path: 'news',
          name: 'news',
          component: news,
          children: [
            {
              path: 'message',
              name: 'message',
              component: message
            },
            {
              path: 'messageDetail/:id',
              name: 'messageDetail',
              component: messageDetail
            },
            {
              path: '',
              redirect: "message"
            },
          ]
        },
        {
          path: '',
          redirect:"about"
        }

      ]
    }
  ]
})
