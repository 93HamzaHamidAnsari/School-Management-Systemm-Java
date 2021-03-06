USE [smsystem]
GO
/****** Object:  Table [dbo].[student]    Script Date: 06/24/2015 22:02:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[student](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[class] [nvarchar](50) NOT NULL,
	[enroll] [nvarchar](50) NULL,
	[age] [nvarchar](50) NOT NULL,
	[image] [binary](50) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[nts]    Script Date: 06/24/2015 22:02:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nts](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[position] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[fees]    Script Date: 06/24/2015 22:02:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[fees](
	[id] [int] NOT NULL,
	[month] [nvarchar](50) NULL,
	[fee] [nvarchar](50) NULL,
	[sid] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[faculti]    Script Date: 06/24/2015 22:02:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[faculti](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[class] [nvarchar](50) NULL,
	[age] [nvarchar](50) NULL
) ON [PRIMARY]
GO
