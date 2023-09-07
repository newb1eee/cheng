import request from '@/utils/request'

// 查询工人基本信息列表
export function listBasic(query) {
  return request({
    url: '/workers/basic/list',
    method: 'get',
    params: query
  })
}

// 查询工人基本信息详细
export function getBasic(id) {
  return request({
    url: '/workers/basic/' + id,
    method: 'get'
  })
}

// 新增工人基本信息
export function addBasic(data) {
  return request({
    url: '/workers/basic',
    method: 'post',
    data: data
  })
}

// 修改工人基本信息
export function updateBasic(data) {
  return request({
    url: '/workers/basic',
    method: 'put',
    data: data
  })
}

// 删除工人基本信息
export function delBasic(id) {
  return request({
    url: '/workers/basic/' + id,
    method: 'delete'
  })
}
