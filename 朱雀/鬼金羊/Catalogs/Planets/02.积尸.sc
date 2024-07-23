// Object * eps Cnc  ---  Spectroscopic Binary  ---  OID=@1109964   (@@20619,1)  ---  coobox=5624 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Star 
Barycenter "EPS Cnc A"
{
	ParentBody      "EPS Cnc"
}

Star "EPS Cnc Aa"
{
	DateUpdated     "2024-07-23"
	ParentBody      "EPS Cnc A"
	Class           "A5III"
	AbsMagn         0.00
	MassSol         2.420
	RadSol          4.8
	LumBol          90
	Teff            8163
	FeH             0.10
	Age             0.637

	BinaryOrbit     
	{
		PeriodDays      35.14101
		Separation      0.35528271045397132030611486737499 // 1.9127 mas
		Eccentricity    0.4195
		Inclination     81.454
		AscendingNode   356.069
		Epoch           2448314.598
		ArgOfPericenter 258.38
		MeanAnomaly     0
	}
}

Star "EPS Cnc Ab"
{
	DateUpdated     "2024-07-23"
	ParentBody      "EPS Cnc A"
	Class           ""
	MassSol         2.226
}

// Object HD 73711  ---  Star  ---  OID=@1110996   (@@125221,0)  ---  coobox=5624 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star 
Star "HD 73711/Gaia DR3 661290758744228224/TIC 175261984/Cl* NGC 2632 S 112/Cl* NGC 2632 KW 276/Cl* NGC 2632 VL 997/Cl* NGC 2632 RUS 194/Cl* NGC 2632 HERT 145/Cl* NGC 2632 WJJP 123/AG+19 875/BD+20 2163/BDS 4711 B/CCDM J08404+1932B/GC 11893/GCRV 5707/GEN# +2.26320276/GSC 01395-01677/HGAM 583/IDS 08348+1954 B/JP11 4122/PPM 125570/ROT 3635/SAO 98018/SKY# 16604/TYC 1395-1677-1/UBV 8289/UBV M 33541/YZ 0 1098/YZ 19 3488/[GS83] 25/uvby98 226320276/2MASS J08401810+1931552/WDS J08405+1933B/** S 574B/Renson 20520/Gaia DR1 661290754445957248/WEB 8201/Gaia DR2 661290758744228224/EPIC 211953905"
{
	DateUpdated     "2024-07-23"
	ParentBody      "EPS Cnc"
	Parallax        5.4103
	AppMagn         7.51
	Class           "F0III"
	AbsMagn         1.18 // 计算的值
	MassSol         2.54
	RadSol          2.4
	LumBol          43.5
	Teff            9572
	FeH             0.79
	Age             0.407

	Orbit // 系统生成
	{
		SemiMajorAxis   24925.6998345121 // 134.19 asec
		Eccentricity    0.30881694
		Inclination     45.8590178
		AscendingNode   23.178556
		ArgOfPericenter 33.8212146
		MeanAnomaly     220.171676
	}
}