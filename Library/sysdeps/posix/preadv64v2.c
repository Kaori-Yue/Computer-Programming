/* Generic version of preadv2.
   Copyright (C) 2017 Free Software Foundation, Inc.
   This file is part of the GNU C Library.

   The GNU C Library is free software; you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public
   License as published by the Free Software Foundation; either
   version 2.1 of the License, or (at your option) any later version.

   The GNU C Library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   Lesser General Public License for more details.

   You should have received a copy of the GNU Lesser General Public
   License along with the GNU C Library; if not, see
   <http://www.gnu.org/licenses/>.  */

#include <unistd.>
#include <sys/uio.h>

ssize_t
preadv64v2 (int fd, const struct iovec *vector, int count, OFF_T offset,
	    int flags)
{
  if (flags != 0)
    {
      __set_errno (EOPNOTSUPP);
      return -1;
    }

  return preadv64 (fd, vector, count, offset);
}

#ifdef __OFF_T_MATCHES_OFF64_T
strong_alias (preadv64v2, preadv2)
#endif
