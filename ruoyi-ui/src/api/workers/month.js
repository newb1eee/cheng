import request from '@/utils/request'

// 查询工人工时按月划分列表
export function listMonth(query) {
  return request({
    url: '/workers/month/list',
    method: 'get',
    params: query
  })
}

// 查询工人工时按月划分详细
export function getMonth(id) {
  return request({
    url: '/workers/month/' + id,
    method: 'get'
  })
}

// 新增工人工时按月划分
export function addMonth(data) {
  return request({
    url: '/workers/month',
    method: 'post',
    data: data
  })
}

// 修改工人工时按月划分
export function updateMonth(data) {
  return request({
    url: '/workers/month',
    method: 'put',
    data: data
  })
}

// 删除工人工时按月划分
export function delMonth(id) {
  return request({
    url: '/workers/month/' + id,
    method: 'delete'
  })
}
