USE [master]
GO
/****** Object:  Database [library]    Script Date: 22/05/2023 14.01.58 ******/
CREATE DATABASE [library]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'library', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\library.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'library_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\library_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [library] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [library].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [library] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [library] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [library] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [library] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [library] SET ARITHABORT OFF 
GO
ALTER DATABASE [library] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [library] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [library] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [library] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [library] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [library] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [library] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [library] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [library] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [library] SET  DISABLE_BROKER 
GO
ALTER DATABASE [library] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [library] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [library] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [library] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [library] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [library] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [library] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [library] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [library] SET  MULTI_USER 
GO
ALTER DATABASE [library] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [library] SET DB_CHAINING OFF 
GO
ALTER DATABASE [library] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [library] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [library] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [library] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [library] SET QUERY_STORE = OFF
GO
USE [library]
GO
/****** Object:  User [serverGilang]    Script Date: 22/05/2023 14.01.58 ******/
CREATE USER [serverGilang] WITHOUT LOGIN WITH DEFAULT_SCHEMA=[serverGilang]
GO
/****** Object:  Schema [serverGilang]    Script Date: 22/05/2023 14.01.58 ******/
CREATE SCHEMA [serverGilang]
GO
/****** Object:  UserDefinedFunction [dbo].[COBA]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[COBA] (@ID INT)
RETURNS FLOAT
AS
BEGIN
    DECLARE @TGL INT, @Denda FLOAT;

    SELECT @TGL = DATEDIFF(DAY, GETDATE(), Tanggal_Kembali)
    FROM detailPeminjaman
    WHERE Kode_Peminjaman = @ID;

    IF @TGL < 0
        SET @Denda = @TGL * -3000.0;
    ELSE
        SET @Denda = 0.0;

    RETURN @Denda;
END;
GO
/****** Object:  Table [dbo].[adminLibrary]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[adminLibrary](
	[Nama] [varchar](50) NULL,
	[username] [varchar](25) NULL,
	[password] [varchar](25) NULL,
	[role] [varchar](25) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[detailPeminjaman]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detailPeminjaman](
	[Kode_Peminjaman] [int] NOT NULL,
	[NIM] [int] NULL,
	[Nama] [varchar](255) NULL,
	[Kode_Buku] [char](3) NULL,
	[Tanggal_Pinjam] [date] NULL,
	[Tanggal_Kembali] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[Kode_Peminjaman] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[detailPengembalian]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detailPengembalian](
	[Kode_Peminjaman] [int] NOT NULL,
	[Nama] [varchar](255) NULL,
	[Kode_Buku] [char](3) NULL,
	[Nama_Buku] [varchar](255) NULL,
	[Tanggal_Kembali] [date] NULL,
	[Denda] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[Kode_Peminjaman] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[detailTransaksi]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detailTransaksi](
	[Kode_Buku] [varchar](3) NOT NULL,
	[Nama_Buku] [varchar](255) NULL,
	[Jumlah] [int] NULL,
	[namaUser] [varchar](50) NULL,
	[role] [varchar](25) NULL,
	[tanggalUpdate] [date] NULL,
	[Keterangan] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Kode_Buku] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_Mahasiswa]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Mahasiswa](
	[NIM] [int] NOT NULL,
	[Nama] [varchar](255) NULL,
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[Jurusan] [varchar](255) NULL,
	[tglBergabung] [date] NULL,
 CONSTRAINT [PK_Mahasiswa] PRIMARY KEY CLUSTERED 
(
	[NIM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblBuku]    Script Date: 22/05/2023 14.01.58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblBuku](
	[Kode_Buku] [char](3) NOT NULL,
	[Nama_Buku] [varchar](255) NULL,
	[Pengarang] [varchar](255) NULL,
	[Penerbit] [varchar](255) NULL,
	[Tahun_Terbit] [varchar](50) NULL,
	[Jumlah] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Kode_Buku] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
USE [master]
GO
ALTER DATABASE [library] SET  READ_WRITE 
GO
