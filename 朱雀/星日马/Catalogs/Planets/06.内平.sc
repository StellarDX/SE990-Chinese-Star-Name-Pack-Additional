// Object * 11 LMi  ---  RS CVn Variable  ---  OID=@1639339   (@@33972,0)  ---  coobox=12316 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Variable Star,RS CVn Variable,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "11 LMi A" {ParentBody "11 LMi"}
Remove "11 LMi B" {ParentBody "11 LMi"}
Star "11 LMi A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "HIP 47080"
	Class           "G8Va"
	AbsMagn         5.25
	MassSol         0.936
	RadSol          0.992
	LumBol          0.783
	Teff            5452
	FeH             0.34
	RotationPeriod  432
	Age             7.9

	BinaryOrbit     
	{
		Period          201
		Separation      43.1416098819976 // 3.84 asec
		Eccentricity    0.88
		Inclination     117
		AscendingNode   41.3
		Epoch           2432551.939061
		ArgOfPericenter 170
		MeanAnomaly     0
	}
}

// Object * 11 LMi B  ---  High Proper Motion Star  ---  OID=@1639340   (@@33972,1)  ---  coobox=12316 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "11 LMi B/GJ 356 B/Gaia DR3 798068940086479104/ADS 7441 B/BD+36 1979B/CCDM J09357+3549B/CSI+36 1979 3/IDS 09297+3616 B/Zkh 132/[RHG95] 1519/WDS J09357+3549B/** HU 1128B/HD 82885B/Gaia DR2 798068935792448512"
{
	DateUpdated     "2024-07-30"
	ParentBody      "HIP 47080"
	Parallax        88.9812
	AppMagn         13
	Class           "M4"
	AbsMagn         12.75 // 计算的值
	MassSol         0.23
}

// Object * 20 LMi  ---  High Proper Motion Star  ---  OID=@1668516   (@@34863,4)  ---  coobox=12396 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,UV-emission Source 
Remove "20 LMi A" {ParentBody "20 LMi"}
Remove "20 LMi B" {ParentBody "20 LMi"}
Star "20 LMi A"
{
	DateUpdated     "2024-07-30"
	ParentBody      "GJ 376"
	Class           "G3VaHdel1"
	AbsMagn         4.46
	MassSol         1.12
	RadSol          1.247
	LumBol          1.378
	Teff            5735
	RotationPeriod  255.36
	Age             6.2 // 7.7

	BinaryOrbit     
	{
		Separation      2016
	}
}

// Object * 20 LMi B  ---  High Proper Motion Star  ---  OID=@1668963   (@@122760,6)  ---  coobox=12396 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,X-ray Source 
Star "20 LMi B/GJ 376 B/Gaia DR3 746545859566712832/TIC 172954298/2MASS J10005030+3155459/USNO-B1.0 1219-00195906/[FS2003] 0537/RBS 820/LSR J1000+3155/2MASSW J1000503+315545/LSPM J1000+3155/1RXS J100050.9+315555/RX J1000.8+3155/[ZEH2003] RX J1000.8+3155 1/WDS J10010+3155B/** RAG 7B/CCDM J10010+3155B/HD 86728B/BD+32 1964B/WISEA J100049.78+315540.7/Gaia DR2 746545859566712832/UCAC4 610-046343/Karmn J10008+319"
{
	DateUpdated     "2024-07-30"
	ParentBody      "GJ 376"
	Class           "M6.0V"
	MassSol         0.11
	RotationPeriod  462.4488
}

Planet "20 LMi Ab"
{
	ParentBody     "20 LMi A"
	DiscDate       "2012"
	Class          "IceGiant"
	Mass           10.2

	Orbit
	{
		PeriodDays      31.15
		SemiMajorAxis   0.2003
		Eccentricity    0.2
	}
}

// Object HD 88986b  ---  Extra-solar Planet Candidate  ---  OID=@24189083   (@@-1,255)  ---  coobox=12499
// Object types: Star,Extra-solar Planet Candidate
Remove "HD 88986 b" {ParentBody "HD 88986"}
Planet "HD 88986 b"
{
	ParentBody     "24 LMi"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	Mass           17.2
	Radius         15881.56113

	Orbit
	{
		Epoch           2458891.690
		SemiMajorAxis   0.58
		PeriodDays      146.05
		Eccentricity    0.24
		Inclination     89.9
		ArgOfPericen    306
	}
}

// Object HD 88986c  ---  Extra-solar Planet Candidate  ---  OID=@24189084   (@@-1,255)  ---  coobox=12499
// Object types: Star,Extra-solar Planet Candidate
// 原论文中提到的另一个物体，可能是行星，但质量有些大的不寻常
Star "HD 88986 c"
{
	ParentBody     "24 LMi"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	MassJup        145

	Orbit
	{
		Epoch           2465000
		SemiMajorAxis   26.2
		Period          116
		Eccentricity    0.46
		Inclination     54.5 // 135.5
		AscendingNode   29.1
		LongOfPericen   344
		MeanLongitude   344
	}
}