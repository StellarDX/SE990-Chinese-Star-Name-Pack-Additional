// Object * kap Cep  ---  Star  ---  OID=@289378   (@@6660,0)  ---  coobox=965 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "KAP Cep A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "KAP Cep"
	Class           "B9III"
	AbsMagn         -0.56
	MassSol         3.02
	RadSol          4.45
	LumBol          191
	Teff            10174
	FeH             -0.05
	Age             0.302

	BinaryOrbit
	{
		Epoch           2457024
		Separation      722.089063023072 // 7.35 asec
		PositionAngle   120
	}
}

// Object * kap Cep B  ---  Star  ---  OID=@289379   (@@6660,1)  ---  coobox=965 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "KAP Cep B/Gaia DR3 2290599311288350720/TIC 237300603/ADS 13524 B/BD+77 764B/CCDM J20088+7743B/CSI+77 764 2/GCRV 7308 E/IDS 20123+7725 B/2MASS J20085536+7742372/WDS J20089+7743B/** STF 2675B/TYC 4589-3108-1/WEB 17691/Gaia DR2 2290599311288350720"
{
	DateUpdated     "2024-04-29"
	ParentBody      "KAP Cep"
	Parallax        9.9753
	AppMagn         8.3 // Stellarium
	Class           "A7V"
	AbsMagn         3.29 // 计算的值
	RadSol          1.32
	LumBol          4.05
	Teff            7119
}

// Object * 75 Dra  ---  Star  ---  OID=@301887   (@@6348,7)  ---  coobox=986 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "75 Dra A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "75 Dra"
	Class           "G9III"
	AbsMagn         -0.256 // 计算的值
	MassKg          5.68366213916978e+30 // log(g) = 2.49 cm/s^2
	RadSol          15.92557 // Gaia DR3
	LumBol          139.639449754687 // 计算的值
	Teff            4972
	FeH             -0.023

	BinaryOrbit
	{
		Separation      14585.9429528365 // 109.45 asec
		PositionAngle   350
	}
}

// Object BD+80 659B  ---  Star  ---  OID=@301888   (@@6348,8)  ---  coobox=986 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+80 659B/Gaia DR3 2298390867294759808/TIC 398238193/CCDM J20282+8126B/CSI+80 659 2/GEN# +1.00196787B/IDS 20345+8105 B/UBV 21586/WDS J20282+8125B/GSC 04597-00173/UCAC3 343-27111/2MASS J20282418+8127091/PPMX J202824.1+812709/** BUP 211B/Gaia DR2 2298390867294759808"
{
	DateUpdated     "2024-04-29"
	ParentBody      "75 Dra"
	Parallax        7.4963
	AppMagn         11.34
	Class           ""
	AbsMagn         5.71 // 计算的值
	MassKg          1.68594005241686e+30 // log(g) = 4.523 cm/s^2
	RadSol          0.8350297 // Gaia DR3
	LumBol          0.489721035562956 // 计算的值
	Teff            5284
	FeH             -0.039
}