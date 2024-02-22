export type TagType = {
  key: string;
  label: string;
};

export type GeographicItemType = {
  name: string;
  id: string;
};

export type GeographicType = {
  province: GeographicItemType;
  city: GeographicItemType;
};

export type NoticeType = {
  id: string;
  title: string;
  logo: string;
  description: string;
  updatedAt: string;
  member: string;
  href: string;
  memberLink: string;
};

export type BaseResponse<T> = {
  code: number;
  data: T;
  message: string;
  description: string;
};
export type CurrentUser = {
  id?: string;
  userAccount?: string;
  avartarUrl?: string;
  gender?: number;
  email?: string;
  phone?: string;
  username?: string;
  email?: string;
  userStatus?: number;
  planetCode?: string;
  createTime?: Date;
  updateTime?: Date;
  isDelete?: number;
  userRole?: number;
};
